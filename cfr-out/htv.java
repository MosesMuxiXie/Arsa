/*
 * Decompiled with CFR 0.152.
 */
import java.util.BitSet;
import java.util.Locale;
import java.util.Set;

public class htv {
    private static final int a = iz.values().length;
    private final BitSet b = new BitSet(a * a);

    public void a(Set<iz> $$0) {
        for (iz $$1 : $$0) {
            for (iz $$2 : $$0) {
                this.a($$1, $$2, true);
            }
        }
    }

    public void a(iz $$0, iz $$1, boolean $$2) {
        this.b.set($$0.ordinal() + $$1.ordinal() * a, $$2);
        this.b.set($$1.ordinal() + $$0.ordinal() * a, $$2);
    }

    public void a(boolean $$0) {
        this.b.set(0, this.b.size(), $$0);
    }

    public boolean a(iz $$0, iz $$1) {
        return this.b.get($$0.ordinal() + $$1.ordinal() * a);
    }

    public String toString() {
        StringBuilder $$0 = new StringBuilder();
        $$0.append(' ');
        for (iz $$1 : iz.values()) {
            $$0.append(' ').append($$1.toString().toUpperCase(Locale.ROOT).charAt(0));
        }
        $$0.append('\n');
        for (iz $$2 : iz.values()) {
            $$0.append($$2.toString().toUpperCase(Locale.ROOT).charAt(0));
            for (iz $$3 : iz.values()) {
                if ($$2 == $$3) {
                    $$0.append("  ");
                    continue;
                }
                boolean $$4 = this.a($$2, $$3);
                $$0.append(' ').append($$4 ? (char)'Y' : 'n');
            }
            $$0.append('\n');
        }
        return $$0.toString();
    }
}

