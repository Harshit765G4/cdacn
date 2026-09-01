import copy


class AccountNotFoundError(Exception):
    pass


class OverdraftError(Exception):
    pass


class InvalidTransactionError(Exception):
    pass


def process_transaction_batch(accounts, batch_list, log_path):

    try:
        backup = copy.deepcopy(accounts)

        for Transcation in batch_list:

            account = Transcation['acc']
            transaction_type = Transcation['type']
            amount = Transcation['amt']

            if account not in accounts:
                raise AccountNotFoundError(
                    f"Account '{account}' not found."
                )

            if transaction_type not in ['deposit', 'withdraw']:
                raise InvalidTransactionError(
                    f"Invalid transaction type '{transaction_type}'."
                )

            if amount <= 0:
                raise InvalidTransactionError(
                    "Transaction amount must be positive."
                )

            if transaction_type == 'deposit':
                accounts[account] += amount

            elif transaction_type == 'withdraw':

                if accounts[account] < amount:
                    raise OverdraftError(
                        f"Insufficient funds. Account {account} "
                        f"has balance {accounts[account]}, requested {amount}."
                    )

                accounts[account] -= amount

        with open(log_path, "a") as file:
            file.write(
                f"[SUCCESS] Batch completed. "
                f"{len(batch_list)} transaction(s) processed.\n"
            )

        return accounts

    except Exception as e:

        accounts.clear()
        accounts.update(copy.deepcopy(backup))

        with open(log_path, "a") as file:
            file.write(
                f"[ROLLBACK] Batch aborted: "
                f"{type(e).__name__} - {e}\n"
            )

        raise


accounts = {"ACC01": 100.0, "ACC02": 50.0}
log_file = "transactions.log"

batch_1 = [
    {"acc": "ACC01", "type": "withdraw", "amt": 20.0},
    {"acc": "ACC02", "type": "deposit", "amt": 10.0}
]

accounts = process_transaction_batch(accounts, batch_1, log_file)
print(accounts)