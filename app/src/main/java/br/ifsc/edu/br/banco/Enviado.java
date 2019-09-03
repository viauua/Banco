package br.ifsc.edu.br.banco;

public class Enviado {

    String topicoID;
    String perguntaID;
    String respostaID;

    public Enviado(){

    }

    public Enviado(String topicoID, String perguntaID, String respostaID) {
        this.topicoID = topicoID;
        this.perguntaID = perguntaID;
        this.respostaID = respostaID;
    }

    public String getTopicoID() {
        return topicoID;
    }

    public String getPerguntaID() {
        return perguntaID;
    }

    public String getRespostaID() {
        return respostaID;
    }

}
