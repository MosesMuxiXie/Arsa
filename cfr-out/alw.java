/*
 * Decompiled with CFR 0.152.
 */
public record alw<T>(int a, alx<T> b) {
    @Override
    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 == null || this.getClass() != $$0.getClass()) {
            return false;
        }
        alw $$1 = (alw)$$0;
        return this.a == $$1.a;
    }

    @Override
    public int hashCode() {
        return this.a;
    }

    @Override
    public String toString() {
        return "<entity data: " + this.a + ">";
    }
}

