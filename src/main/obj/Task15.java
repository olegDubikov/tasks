package main.obj;

public class Task15 {
    Object nested;
    Object obj = new Object(){
        public Object getNested() {
            return nested;
        }
    };
}