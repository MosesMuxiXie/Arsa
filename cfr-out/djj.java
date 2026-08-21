/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntList
 */
import it.unimi.dsi.fastutil.ints.IntList;

public interface djj
extends bhh {
    public IntList a();

    default public int b() {
        return this.a().size();
    }

    public static djj a(final String $$0, final IntList $$1) {
        return new djj(){

            @Override
            public IntList a() {
                return $$1;
            }

            @Override
            public String c() {
                return $$0;
            }

            public String toString() {
                return $$0;
            }
        };
    }
}

