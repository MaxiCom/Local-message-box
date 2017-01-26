import easygui

class MessageBox:
	def display_message(self, address, message):
		print '\033[32mNew message from %s\033[m' % address
		easygui.msgbox(message, title='New message from %s' % address)
