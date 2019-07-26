package com.learn.java8.nashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

class NashornSample {
    void script(){
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");

        String name = "David Jose";
        Integer result = null;

        try {
            nashorn.eval("print('" + name + "')");
            result = (Integer) nashorn.eval("10 + 5");

        } catch(ScriptException e) {
            System.out.println("Error executing script: "+ e.getMessage());
        }
        assert result != null;
        System.out.println(result.toString());
    }
}
