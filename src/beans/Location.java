package beans;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "book")
@XmlType(propOrder = { "numeroRue", "rue"})
public class Location {

private String rue; 
private int numeroRue;


public String getRue() {
	return rue;
}
public void setRue(String rue) {
	this.rue = rue;
}

public int getNumeroRue() {
	return numeroRue;
}
public void setNumeroRue(int numeroRue) {
	this.numeroRue = numeroRue;
} 



}
