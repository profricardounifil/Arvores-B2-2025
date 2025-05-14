public class Teste {
    private No raiz;

    public Teste(int conteudo) {
        raiz = new No(conteudo);
    }

    public void inserir(int conteudo) {
        No novoNo = new No(conteudo);
        if(raiz == null) {
            raiz = novoNo;
        } else {
            No aux = raiz;
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

    public void inserirRec(int conteudo) {
        No novoNo = new No(conteudo);
        inserirRecursivo(this.raiz, novoNo);
    }

    public void inserirRec2(int conteudo) {
        this.raiz = inserirRecursivo2(this.raiz, conteudo);
    }

    public void inserirRecursivo(No raizAtual, No novoNo) {
        if(this.raiz == null) {
            raiz = novoNo;
            return;
        }
        if(novoNo.getConteudo() > raizAtual.getConteudo()) {
            if(raizAtual.getDireita() == null) {
                raizAtual.setDireita(novoNo);
                return;
            } else {
                inserirRecursivo(raizAtual.getDireita(), novoNo);
            }
        } else {
            if(raizAtual.getEsquerda() == null) {
                raizAtual.setEsquerda(novoNo);
                return;
            } else {
                inserirRecursivo(raizAtual.getEsquerda(), novoNo);
            }
        }
    }

    public No inserirRecursivo2(No raizAtual, int conteudo) {
        if(raizAtual == null) {
            return new No(conteudo);
        }
        if(conteudo > raizAtual.getConteudo()) {
            raizAtual.setDireita(inserirRecursivo2(raizAtual.getDireita(), conteudo));
        } else {
            raizAtual.setEsquerda(inserirRecursivo2(raizAtual.getEsquerda(), conteudo));
        }

        return raizAtual;
    }

    public void visualizar() {
        posOrdem(raiz);
    }

    public void emOrdem(No no) {
        if (no == null) {
            return;
        }
        emOrdem(no.getEsquerda());
        System.out.println(no.getConteudo());
        emOrdem(no.getDireita());
    }

    public void posOrdem(No no){
        if(no == null) {
            return;
        }
        posOrdem(no.getEsquerda());
        posOrdem(no.getDireita());
        System.out.println(no.getConteudo());
    }
}
