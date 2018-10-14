package HelloWorld.面向对象;

public class PersonHeightAvg {
    Person[] person={new Person(350425198906113715l),new Person(350425198909113215l),new Person(350425198905114515l),};
    void getAvg(){
        double sum=0;
        for (int i = 0; i <person.length ; i++) {
            sum=person[i].Height+sum;
        }
        double HeightAvg=sum/person.length;
    }
}
