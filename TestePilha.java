public class TestePilha {
  public static void main(String[] args) throws PilhaVaziaException {		  
    PilhasArray P1 = new PilhasArray(10); 
    System.out.println("Vermleho ESQUERDO ------------ Preto DIREITO\n");
    System.out.println("A pilha vermelha está vazia? -> " + P1.visEmpty() + "\n");
    System.out.println("A pilha preta está vazia? -> " + P1.pisEmpty() + "\n");
    System.out.println("Tamanho array vermelho: " + P1.vsize());
    System.out.println("Tamanho array preto: " + P1.psize());

    System.out.print("Mostrando a pilha completa: ");
    P1.show();
    
    System.out.println("\nInserindo x elementos pretos na pilha preta");
    for (int i = 0; i < 5; i++){
      P1.ppush(i);
    }    
    
    System.out.println("A pilha preta está vazia? -> " + P1.pisEmpty());
    System.out.println("Tamanho array preto: " + P1.psize());
    System.out.print("Mostrando a pilha preta: ");
    P1.Pshow();
    System.out.println("Último elemento preto: " + P1.ptop() + "\n");

    System.out.print("Mostrando a pilha completa: ");
    P1.show();
    
    System.out.println("\nInserindo x elementos vermelhos na pilha vermelha");
    for (int i = 1; i < 6; i++){
      P1.vpush(i * 200);
    }    
    System.out.println("A pilha vermelha está vazia? -> " + P1.visEmpty());
    System.out.println("Tamanho array vermelho: " + P1.vsize());
    System.out.print("Mostrando a pilha vermelha: ");
    P1.Vshow();
    System.out.println("Último elemento vermelho: " + P1.vtop() + "\n");

    System.out.print("Mostrando a pilha completa (sem remoção até aqui): ");
    P1.show();
    System.out.println("Tamanho vermelho: " + P1.vsize());
    System.out.println("Tamanho preto: " + P1.psize());

    System.out.println("-----------------------------------------");
    for (int i = 0; i < 5; i++){
      P1.ppush(i * 2);
    }
    P1.show();
   

    for (int i = 1; i < 4; i++){
      P1.vpush(i * 325);
    }
    P1.show();
     
    P1.vpop();
    P1.show();
    
    System.out.println("Tamanho vermelho: " + P1.vsize());
    System.out.println("Tamanho preto: " + P1.psize());
    
  }
}