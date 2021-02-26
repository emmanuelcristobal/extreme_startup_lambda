package com.serverless;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ResponderModelTest {
    @Test
    public void  cuandoPreguntanPorElNombreRespondeRocinante(){
        ResponderModel responder = new ResponderModel();
        String pregunta = "d4f58f60: what is your name";
        String respuesta = responder.answer(pregunta);
        assertThat(respuesta).isEqualTo("rocinante");

    }
    @Test
    public void  cuandoPreguntanPorNumeroMayor(){
        ResponderModel responder = new ResponderModel();
        String pregunta = "1e2ff3b0: which of the following numbers is the largest: 50, 36, 776, 713";
        String respuesta = responder.answer(pregunta);
        assertThat(respuesta).isEqualTo("776");

    }
}
