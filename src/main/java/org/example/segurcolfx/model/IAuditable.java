package org.example.segurcolfx.model;

import java.util.ArrayList;

public interface IAuditable {
    String registroNovedad (RegistroNovedad novedad);
    ArrayList<RegistroNovedad> getNovedades();
}
