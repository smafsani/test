import socket 

#HOST = "192.168.10.150"
HOST = "103.204.84.58"
PORT = 5050
ADDR = (HOST, PORT)
DISCONNECT_MESSAGE = "DISCONNECT"
FORMAT = "utf-8"
CONNECTED = True
HEADER = 64

client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
client.connect(ADDR)

def send(message):
    message = message.encode(FORMAT)
    message_size = len(message)
    message_size = str(message_size)
    sending_size = message_size.encode(FORMAT)
    sending_size += b' ' * (HEADER - len(sending_size))
    client.send(sending_size)
    client.send(message)

    message_from_server = client.recv(2048).decode(FORMAT)
    print(f"[SERVER] {message_from_server}")

send("This is first message.")
input()
send("This is second message.")
input()
send("This is third message.")
send("DISCONNECT")
