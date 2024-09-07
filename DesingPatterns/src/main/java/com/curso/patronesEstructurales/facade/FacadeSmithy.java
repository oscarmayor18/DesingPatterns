package com.curso.patronesEstructurales.facade;

public class FacadeSmithy {
    public void work(String name, boolean make){
        if (make) {
            Forge forge = new Forge();
            forge.work(name);
            if (Recipes.getRecipes(name, make)) {
                if (!forge.search(name)) {
                    forge.remove(name);
                    forge.working(name);
                    System.out.println("the " + name + "have been created");
                }else{
                    System.out.println("it has not been possible to " + forge.ACTION  + "the " + name);
                }
            }
        }else {
            WorkBench workBench = new WorkBench();
            workBench.work(name);
            if (Recipes.getRecipes(name, make)) {
                if (!workBench.search(name)) {
                    workBench.remove(name);
                    workBench.working(name);
                    System.out.println("the " + name + "have been improved");
                }else{
                    System.out.println("it has not been possible to " + workBench.ACTION  + "the " + name);

                }
            }
        }
    }
}
