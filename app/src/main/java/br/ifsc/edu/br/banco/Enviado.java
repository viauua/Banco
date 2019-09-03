package br.ifsc.edu.br.banco;

public class Enviado {

    String topicoId;
    String perguntaId;
    String respostaId;

    public Enviado(){

    }

    public Enviado(String topicoId, String perguntaId, String respostaId) {
        this.topicoId = topicoId;
        this.perguntaId = perguntaId;
        this.respostaId = respostaId;
    }

    public String getTopicoId() {
        return topicoId;
    }

    public String getPerguntaId() {
        return perguntaId;
    }

    public String getRespostaId() {
        return respostaId;
    }

}
