package day31.AccessModifiersforClass.Ex1;

public class SamePackageClass {
    public static void main(String[] args) {
        DefaultModifierClass myclass= new DefaultModifierClass(); //WE CAN ACCESS BECAUSE WE ARE IN SAME PACKAGE.
        PublicModifierClass myclass2= new PublicModifierClass() ;
    }
}
