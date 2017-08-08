public class Main{
    
    public static void main( String [] args ){
	MailServer server = new MailServer();
	
	MailClient client = new MailClient(server, "Joao");
	MailClient client2 = new MailClient(server, "Maria");

	//envia email
	client.sendMailItem("Maria", "Hello there", "My first email");
	
	//email recebido
	MailItem email = client2.getNextMailItem();
	email.print();

	//Novo cliente
	MailClient client3 = new MailClient(server, "Jose");

	client.sendMailItem("Jose", "Hello there", "Welcome");
	client2.sendMailItem("Jose", "Hi there", "My first email");

	//Novo cliente le seus emails
	System.out.println("\nClient3 mail\n");
	client3.printNextMailItem();
	client3.printNextMailItem();
	client3.printNextMailItem();
    }
}
