package com.kane.springboot002.proxy;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;

/**
 * 〈一句话功能简述〉<br>
 * 〈ss〉
 *
 * @author Kane
 * Date:   2019/5/28 16:29
 * @since 1.0.0
 */
public class ClassFileTransformerImpl implements ClassFileTransformer {

    @Override
    public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
        return new byte[0];
    }
}