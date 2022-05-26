public class PilhasArray {
    private int capacidade, indiceV, indiceP;
    private Object[] Pilhas;

    public PilhasArray(int capacidade) {
        this.capacidade = capacidade;
        indiceV = -1;
        indiceP = capacidade;
        Pilhas = new Object[capacidade];
    }
  
    public void vpush(Object elemento) {
        if (indiceV + 1 == indiceP){
            int qtdP = psize();
            capacidade *= 2;
            
            Object[] NovoArray = new Object[capacidade];
            for (int i=0; i<indiceV; i++) {
                NovoArray[i] = Pilhas[i];
            }
            for (int i=capacidade - 1; i>capacidade - qtdP; i--) {
              NovoArray[i] = Pilhas[i - (capacidade/2)];
            }
            Pilhas = NovoArray;
            indiceP = capacidade - qtdP;
        }
        Pilhas[++indiceV] = elemento;
    }

    public void ppush(Object elemento) {
        if (indiceV + 1 == indiceP){
            int qtdP = psize();
            capacidade *= 2;
    
            Object[] NovoArray = new Object[capacidade];
            for (int i=0; i<indiceV; i++) {
                NovoArray[i] = Pilhas[i];
            }
            for (int i=capacidade - 1; i>capacidade - qtdP; i--){
              NovoArray[i] = Pilhas[i - (capacidade/2)];
            }
            Pilhas = NovoArray;
            indiceP = capacidade - qtdP;
        }
        Pilhas[--indiceP] = elemento;
    }

    public Object vpop() throws PilhaVaziaException {
        if (visEmpty()) {
            throw new PilhaVaziaException("Está vaziiio, coleguinha!");
        }
        else {
            return Pilhas[indiceV--];
        }
    }

    public Object ppop() throws PilhaVaziaException {
        if (pisEmpty()) {
            throw new PilhaVaziaException("Está vaziiio, coleguinha!");
        }
        else {
            return Pilhas[indiceP++];
        }
    }

    public Object vtop() throws PilhaVaziaException {
        if (visEmpty()) {
            throw new PilhaVaziaException("Está vaziiio, coleguinha!");
        }
        else {
            return Pilhas[indiceV];
        }
    }

    public Object ptop() throws PilhaVaziaException {
        if (pisEmpty()) {
            throw new PilhaVaziaException("Está vaziiio, coleguinha!");
        }
        else {
            return Pilhas[indiceP];
        }
    }

    public boolean visEmpty() {
        if (indiceV > -1) {
            return false;
        }
        else {
            return true;
        }
    }
  
    public boolean pisEmpty() {
        if (indiceP < capacidade) {
            return false;
        }
        else {
            return true;
        }
    }

    public int vsize() {
        return indiceV + 1;
    }

    public int psize() {
        return capacidade - indiceP;
    }
  
    //Extra
    public void show() {
        System.out.print("Pilha:\n");
        for (int i = 0; i < capacidade; i++){
            System.out.print(Pilhas[i] + " ");
        }
            System.out.print("\n");
    }  
    public void Vshow() {
        System.out.print("Pilha vermelha:\n");
        for (int i = 0; i < indiceV + 1; i++){
            System.out.print(Pilhas[i] + " ");
        }
            System.out.print("\n");
    }  

    public void Pshow() {
        System.out.print("Pilha preta:\n");
        for (int i = indiceP; i < capacidade; i++){
            System.out.print(Pilhas[i] + " ");
        }
            System.out.print("\n");
    }  
}