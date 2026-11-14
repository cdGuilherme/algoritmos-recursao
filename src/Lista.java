// Implementação de uma lista simples duplamente ligada
// Código adaptado de outro algoritmo de uma lista circular duplamente ligada

public class Lista {
    public No primeiro, ultimo;
    public int qtdNo = 0;


    // Add (adiciona um nó no final da lista)
    public String add(int info) {
        No novoNo = new No(info);
        if (qtdNo == 0) { // Primeiro nó
            primeiro = novoNo;
        } else { // Segundo nó para frente
            ultimo.proximo = novoNo;
            novoNo.anterior = ultimo;
        }
        ultimo = novoNo;
        qtdNo++;
        return "Elemento adicionado com sucesso!";
    }


    // Remover (remove o nó do final da lista)
    public String remover() {
        if (qtdNo == 0) {
            return "Não há elementos para remover!";
        }

        if (qtdNo == 1) {
            // Remove o único elemento
            primeiro = null;
            ultimo = null;
        } else {
            // Remove o último elemento
            ultimo = ultimo.anterior;
            ultimo.proximo = null;
        }

        qtdNo--;
        return "Último elemento removido com sucesso!";
    }


    // getInfo (retorna a informação do nó pelo índice)
    public int getInfo(int i) {
        if (i < 0 || i >= qtdNo)
            throw new IndexOutOfBoundsException("Índice inválido!");

        No aux = getNo(i);
        return aux.info;
    }


    // getNo (retorna o nó pelo índice)
    public No getNo(int indice) {
        if (qtdNo == 0)
            return null;

        No aux = primeiro;

        for (int i = 0; i < indice; i++)
            aux = aux.proximo;
        return aux;
    }


    // setInfo (muda a informação de um nó pelo índice)
    public String setInfo(int info, int i) {
        if (qtdNo > 0) {
            No aux = getNo(i);
            aux.info = info;
            return "Elemento modificado com sucesso!";
        } else {
            return "Não há elementos para modificar!";
        }
    }
}
