package test.com.ci1330.ecci.ucr.ac.cr;

import com.ci1330.ecci.ucr.ac.cr.factory.XMLFactory;

public class Main {

    public static void main(String[] args) {
        XMLFactory factory = new XMLFactory("example.xml");
        Person p = (Person) factory.getBean("person");
        p.print();

        Pod pod = (Pod)factory.getBean("podBean");
        System.out.println(pod.getLeaf().getPerson());
        System.out.println(pod.getNoFlowers());
        System.out.println(pod.getRose().getColour());
        System.out.println(pod.getTulip().getPointA().getX());
        System.out.println(pod.getPaintSpot().getY());

        factory.shutDownHook();
    }
}
