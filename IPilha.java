public interface IPilha {

	void vpush(Object o);
  void ppush(Object o);

	Object vpop() throws PilhaVaziaException; 
  Object ppop() throws PilhaVaziaException; 
    
	Object vtop() throws PilhaVaziaException; 
  Object ptop() throws PilhaVaziaException; 

	boolean visEmpty(); 
  boolean pisEmpty(); 

	int vsize(); 
  int psize(); 

  void Pshow();
  void Vshow();
  void show();
}