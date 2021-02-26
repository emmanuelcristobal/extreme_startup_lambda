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
}
