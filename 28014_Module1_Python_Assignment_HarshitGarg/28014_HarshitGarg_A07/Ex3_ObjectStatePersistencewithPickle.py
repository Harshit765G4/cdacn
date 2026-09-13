import pickle
import os


class ExperimentSnapshot:

    def __init__(self, experiment_id, model_type, hyperparameters, metrics, timestamp):
        self.experiment_id = experiment_id
        self.model_type = model_type
        self.hyperparameters = hyperparameters
        self.metrics = metrics
        self.timestamp = timestamp

    def get_best_metric(self, metric_name):
        return self.metrics[metric_name]


def save_experiment(snapshot, file_path):
    with open(file_path, "wb") as file:
        pickle.dump(snapshot, file)


def load_experiment(file_path):
    if not os.path.exists(file_path):
        raise FileNotFoundError(f"File not found: {file_path}")

    with open(file_path, "rb") as file:
        return pickle.load(file)


folder = os.path.dirname(os.path.abspath(__file__))
file_path = os.path.join(folder, "experiment_01.pkl")

exp = ExperimentSnapshot(
    experiment_id="EXP-2026-001",
    model_type="RandomForest",
    hyperparameters={
        "n_estimators": 100,
        "max_depth": 10
    },
    metrics={
        "accuracy": 0.942,
        "f1_score": 0.938
    },
    timestamp="2026-09-01 10:00:00"
)

save_experiment(exp, file_path)

restored_exp = load_experiment(file_path)

print(restored_exp.model_type)
print(restored_exp.get_best_metric("accuracy"))