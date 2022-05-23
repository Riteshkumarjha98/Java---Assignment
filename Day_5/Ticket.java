package com.Day_5;

public class Ticket {
	private int ticketid;
	private int price;
	private static int avaialableTickets;
	
	
	
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static int getAvaialableTickets() {
		return avaialableTickets;
	}
	public static void setAvaialableTickets(int avaialableTickets) {
		Ticket.avaialableTickets = avaialableTickets;
	}
	
	public int calculateTickets(int bookTicket) {
		if (this.avaialableTickets > 0) {
			int reduce = avaialableTickets - bookTicket;
			int totalAmount=bookTicket*this.price;
			return totalAmount;
		}
		else {
			return -1;
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter no of booking");
		in.nextInt();
		System.out.print("Enter available ticket");
		in.nextInt();
		System.out.print("Enter ticket id");
		in.nextInt();
		System.out.print("Enter the Price");
		in.nextInt();
		System.out.print("Enter the no of Tickets");
		in.nextInt();
		System.out.print("Available Tickets");
		in.nextInt();
	}

}








