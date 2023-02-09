package com.mcnz.wasm;

import org.teavm.interop.*;

public class ComplexLogic {
	
	@Export(name = "getMagicNumber")
    public static void getMagicNumber(int range) {
		int magicNumber = (range/2) + range%3;
		setMagicNumber(magicNumber);
    }
	
	@Import(module = "env", name = "setMagicNumber")
    private static native void setMagicNumber(int message);

}
