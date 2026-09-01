config = {
    "server": {
        "host": "127.0.0.1",
        "port": 8080,
        "ssl": {
            "enabled": True,
            "cert_path": "/etc/ssl/certs"
        }
    },
    "database": "postgresql://localhost:5432"
}

def traverse_nested_config(config_dict, path_str, default=None):
    if config_dict != dict or not path_str:
        return default
    
    try:
        value = config_dict

        for key in path_str.split('.'):
            value = value[key]
        return value

    except(KeyError,TypeError,AttributeError):
        return default


print(traverse_nested_config(config, "server.ssl.cert_path"))
print(traverse_nested_config(config, "server.database.username", "guest"))
print(traverse_nested_config(config, "database.host", "localhost"))