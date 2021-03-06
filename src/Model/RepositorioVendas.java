package Model;

import java.util.ArrayList;

public class RepositorioVendas implements IRepositorioVendas {

	private ArrayList<Venda> vendas;

	public RepositorioVendas() {
		vendas = new ArrayList<Venda>();
	}

	public void adicionar(Venda venda) {
		this.vendas.add(venda);
	}

	public void remover(Venda venda) {
		this.vendas.remove(venda);
	}

	public boolean existe(Venda venda) {
		if (vendas.contains(venda))
			return true;
		return false;
	}

	public ArrayList<Venda> buscar(Cliente c) {
		ArrayList<Venda> lista = new ArrayList<Venda>();
		for (Venda venda : vendas) {
			if (venda.getCliente().equals(c)) {
				lista.add(venda);
			}
		}
		return lista;

	}

	public ArrayList<Venda> buscar(Vendedor v) {
		ArrayList<Venda> lista = new ArrayList<Venda>();
		for (Venda venda : vendas) {
			if (venda.getVendedor().equals(v)) {
				lista.add(venda);
			}
		}
		return lista;
	}

	public Venda buscar(Venda venda) {
		for (Venda v : vendas) {
			if (v.equals(venda)) {
				return v;
			}
		}
		return null;
	}

	public void cancelar(Venda venda) {

		buscar(venda).setVendaCancelada(true);
	}

	public ArrayList<Venda> buscar() {
		return vendas;
		
	}

}
