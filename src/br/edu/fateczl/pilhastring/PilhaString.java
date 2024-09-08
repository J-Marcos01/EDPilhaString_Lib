package br.edu.fateczl.pilhastring;


public class PilhaString {
	
	No topo;
	
	public PilhaString() {
		
		topo=null;
	}

	public boolean isEmpty() {
		
		if(topo==null) {
			return true;
		}
		return false;
		
	}
	
	public void push(String letra) {
		No elemento=new No();
		elemento.dado=letra;
		elemento.proximo=topo;
		topo=elemento;
								
	}
	
	public String pop()throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("Pilha Vazia");
		}
		String letra=topo.dado;
		topo=topo.proximo;
		return letra;
			
	}
	public String top()throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("Pilha Vazia");
		}
		String letra=topo.dado;
		return letra;
			
	}
	public int size() {
		int cont=0;
		if(!isEmpty()) {
			No auxiliar =topo;
			cont=1;
			while(auxiliar.proximo!=null) {
				cont++; 
				auxiliar=auxiliar.proximo;
			}
		}
		return cont ;
	}
	
	
}
