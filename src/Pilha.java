package one.digitalinnovation;

public class Pilha {

    private  No refNoEntradaPilha;

    public Pilha() {

        this.refNoEntradaPilha = null;
    }

    public  void push(No novoNo){
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);

    }

    public No pop(){
        if(this.isEmpty()){
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return  noPoped;
        }

    }
    public  No top(){
       return refNoEntradaPilha;

    }

    public boolean isEmpty(){
    /*    if(refNoEntradaPilha == null){
          return  true;
       }
          return  false;*/
        return refNoEntradaPilha == null ? true : false;


    }
}
