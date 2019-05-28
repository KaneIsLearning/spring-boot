package com.kane.springboot002.proxy;

import java.lang.instrument.ClassDefinition;
import java.lang.instrument.Instrumentation;
import java.lang.instrument.UnmodifiableClassException;

/**
 * 〈一句话功能简述〉<br>
 * 〈ss〉
 *
 * @author Kane
 * Date:   2019/5/28 15:57
 * @since 1.0.0
 */
public class Premain {
    public static void premain(String agentArgs,Instrumentation inst)
            throws ClassNotFoundException,UnmodifiableClassException{
        inst.addTransformer(new ClassFileTransformerImpl());

    }

}