public class ArvoreBinaria {
    private No raiz;

    public ArvoreBinaria(int conteudo) {
        raiz = new No(conteudo);
    }

    public boolean estaVazia() {
        if(raiz == null) {
            return true;
        } else {
            return false;
        }
    }

    public void inserir(int conteudo) {
        No novoNo = new No(conteudo);
        if(estaVazia()) {
            raiz = novoNo;
        } else {
            if(raiz.getConteudo() > novoNo.getConteudo()) {
                //verificar filho a esquerda
                if(raiz.getEsquerda() == null) {
                    //verificando se tem filho a esquerda
                    raiz.setEsquerda(novoNo);
                }
            } else {
                if(raiz.getDireita() == null) {
                    //verificando se tem filho a direita
                    raiz.setDireita(novoNo);
                } else {
                    No aux = raiz;
                    aux = aux.getDireita();
                    if(aux.getConteudo() < novoNo.getConteudo()) {
                        //setar esquerda
                    } else {
                        //setar direita

                    }
                }
                //verificar filho a direita
            }
        }
    }

    public void inserirRecRedir(int conteudo) {
        No novoNo = new No(conteudo);
        No aux = this.raiz;
        inserirRecursivo(novoNo, aux);
    }

    public void inserirRecursivo(No novoNo, No aux) {
        if(aux == null) {
            this.raiz = novoNo;
        }
        inserirRecursivo(novoNo, aux);
    }
    public void visualizar() {
        //preOrdem(this.raiz);
        //posOrdem(this.raiz);
        emOrdem(this.raiz);
    }

    public void preOrdem(No no) {
        if(no == null) {
            return;
        }
        System.out.println(no.getConteudo());
        preOrdem(no.getEsquerda());
        preOrdem(no.getDireita());
    }

    public void emOrdem(No no) {
        if(no == null) {
            return;
        }
        emOrdem(no.getEsquerda());
        System.out.println(no.getConteudo());
        emOrdem(no.getDireita());
    }

    public void posOrdem(No no) {
        if(no == null) {
            return;
        }
        posOrdem(no.getEsquerda());
        posOrdem(no.getDireita());
        System.out.println(no.getConteudo());
    }

}
