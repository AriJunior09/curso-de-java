package entidade;
    
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidadeEnum.StatusPedido;

public class C17_Pedido {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private StatusPedido status;
	private C17_Cliente cliente;
	
	private List<C17_ItemPedido> itemPedido = new ArrayList<>();
	
	public C17_Pedido() {
		
	}

	public C17_Pedido(Date moment, StatusPedido status, C17_Cliente cliente, List<C17_ItemPedido> itemPedido) {
		this.moment = moment;
		this.status = status;
		this.cliente = cliente;
	}
	
	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public C17_Cliente getCliente() {
		return cliente;
	}

	public void setCliente(C17_Cliente cliente) {
		this.cliente = cliente;
	}

	public List<C17_ItemPedido> getItems() {
		return itemPedido;
	}
	
	public void addItem(C17_ItemPedido itemP) {
		itemPedido.add(itemP);
	}
	
	public void removeItem(C17_ItemPedido itemP) {
		itemPedido.remove(itemP);
	}
	
	public double total() {
		double sum = 0.0;
		for (C17_ItemPedido item : itemPedido) {
			sum += item.subTotal();
		}
		return sum;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Momento do Pedido: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Status do Pedido: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("Itens do Pedido:\n");
		for (C17_ItemPedido item : itemPedido) {
			sb.append(item + "\n");
		}
		sb.append("Total do Pedido: R$");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}	
	
}

