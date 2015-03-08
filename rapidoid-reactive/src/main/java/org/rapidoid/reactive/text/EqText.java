package org.rapidoid.reactive.text;

import org.rapidoid.reactive.Bool;
import org.rapidoid.reactive.Text;
import org.rapidoid.reactive.bool.AbstractBool;

public class EqText extends AbstractBool implements Bool {

	private final Text t1;
	private final Text t2;

	public EqText(Text t1, Text t2) {
		this.t1 = t1;
		this.t2 = t2;
	}

	@Override
	public boolean get() {
		return t1.get().equals(t2.get());
	}

}
