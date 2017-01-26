from socket import *

class Server:
	def __init__(self, HOST, PORT):
		print '\033[32mServer opening ... Done!\033[m'

		self.server = socket(AF_INET, SOCK_DGRAM);
		self.server.bind((HOST, PORT))

	def listen(self, message_box):
		print '\033[32mServer listening ... Done!\033[m'
		
		while True:
			data, address = self.server.recvfrom(4096)
			message_box.display_message(address[0], data)

	def close(self):
		print '\033[31mServer closing ... Done!\033[m'

		self.server.close()
