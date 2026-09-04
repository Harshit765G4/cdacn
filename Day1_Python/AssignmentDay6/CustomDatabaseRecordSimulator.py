class RecordNotFoundError(Exception):
    pass

class DatabaseRecord:
    def __init__(self, record_id, data):
        
        if not isinstance(record_id, int):
            raise TypeError("Record ID value must be an integer.")
        if record_id <= 0:
            raise ValueError("Record ID Value must be a positive integer.")
        if not isinstance(data, dict):
            raise TypeError("Data value must be a Dictionary.")
        
        self.record_id = record_id
        self.data = data
        
    def __repr__(self):
        return f"Record(id={self.record_id}, data={self.data})"
    
    def __str__(self):
        return f"Record(id={self.record_id}, data={self.data})"
    

class ResultSetIterator:
    def __init__(self, records_list):
        self.index_counter = 0
        self.records_list = records_list
    
    def __iter__(self):
        return self
    
    def __next__(self):
        if self.index_counter >= len(self.records_list):
            raise StopIteration
        
        record = self.records_list[self.index_counter]
        self.index_counter += 1
        return record
        
class DatabaseResultSet:
    def __init__(self, records_list):
        self.records_list = records_list
        
    def __len__(self):
        return len(self.records_list)

    def __iter__(self):
        return ResultSetIterator(self.records_list)
    
    def __getitem__(self, key):
        try:
            if isinstance(key, int):
                return self.records_list[key]
            elif isinstance(key, str):
                for record in self.records_list:
                    if record.data["name"] == key:
                        return record
                    
        except RecordNotFoundError as e:
            raise RecordNotFoundError(
                    f"Record with name {key} not found in database."
                )
            
r1 = DatabaseRecord(101, {"name": "Alice", "role": "Admin"})
r2 = DatabaseRecord(102, {"name": "Bob", "role": "User"})

results = DatabaseResultSet([r1, r2])

print(len(results))
print(results[0].data["role"])

record = results["Bob"]
print(record.record_id)

for rec in results:
    print(rec.record_id)
    
try:
    missing = results["Charlie"]
except RecordNotFoundError as e:
    print(e)