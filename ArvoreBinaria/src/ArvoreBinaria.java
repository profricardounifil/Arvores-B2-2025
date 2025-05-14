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
            No aux = this.raiz;
            while(true) {
                if(novoNo.getConteudo() > aux.getConteudo()) {
                    if(aux.getDireita() == null) {
                        aux.setDireita(novoNo);
                        return;
                    } else {
                        aux = aux.getDireita();
                    }
                } else {
                    if(aux.getEsquerda() == null) {
                        aux.setEsquerda(novoNo);
                        return;
                    } else {
                        aux = aux.getEsquerda();
                    }
                }

            }
        }
    }

    public void inserirRecursivoRedirecionamentoOtimizado(int conteudo) {
        No novoNo = new No(conteudo);
        this.raiz = inserirRecursivoOtimizado(this.raiz, novoNo);
    }

    private No inserirRecursivoOtimizado(No aux, No novoNo) {
        if(aux == null) {
            return novoNo;
        } else if (novoNo.getConteudo() > aux.getConteudo()) {
            aux.setDireita(inserirRecursivoOtimizado(aux.getDireita(), novoNo));
        } else {
            aux.setEsquerda(inserirRecursivoOtimizado(aux.getEsquerda(), novoNo));
        }

        return aux;
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

    public void inserirRecursivoRedirecionamento2(int conteudo) {
        No novoNo = new No(conteudo);
        inserirRecursivo2(this.raiz, novoNo);
    }

    private void inserirRecursivo2(No aux, No novoNo) {
        if(estaVazia()) {
            this.raiz = novoNo;
            return;
        }
        if(novoNo.getConteudo() > aux.getConteudo()) {
            if(aux.getDireita() == null) {
                aux.setDireita(novoNo);
                return;
            } else {
                aux = aux.getDireita();
            }
        } else {
            if(aux.getEsquerda() == null) {
                aux.setEsquerda(novoNo);
                return;
            } else {
                aux = aux.getEsquerda();
            }
        }
        inserirRecursivo2(aux, novoNo);
    }

}
