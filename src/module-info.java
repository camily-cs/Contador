module contador {
	requires javafx.controls;
	requires javafx.graphics; //exportando controls 
	opens contador; //possibilitando abrir pacote "basico" (telas)
}