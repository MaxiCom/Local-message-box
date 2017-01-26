#!/usr/bin/python2.7
from modules.server import *
from modules.message_box import *

HOST = 'localhost'
PORT = 51515

def main():
	server = Server(HOST, PORT)
	message_box = MessageBox()

	try:
		server.listen(message_box)	
	except KeyboardInterrupt:
		server.close()
	
if __name__ == '__main__':
	main()
