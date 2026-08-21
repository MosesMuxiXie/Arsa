/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 */
import com.google.common.collect.ImmutableList;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;

public record hy(List<String> a, List<String> b) {
    public static hy a(String $$0) {
        ImmutableList.Builder $$1 = ImmutableList.builder();
        ImmutableList.Builder $$2 = ImmutableList.builder();
        int $$3 = $$0.length();
        int $$4 = 0;
        int $$5 = $$0.indexOf(36);
        while ($$5 != -1) {
            if ($$5 == $$3 - 1 || $$0.charAt($$5 + 1) != '(') {
                $$5 = $$0.indexOf(36, $$5 + 1);
                continue;
            }
            $$1.add((Object)$$0.substring($$4, $$5));
            int $$6 = $$0.indexOf(41, $$5 + 1);
            if ($$6 == -1) {
                throw new IllegalArgumentException("Unterminated macro variable");
            }
            String $$7 = $$0.substring($$5 + 2, $$6);
            if (!hy.b($$7)) {
                throw new IllegalArgumentException("Invalid macro variable name '" + $$7 + "'");
            }
            $$2.add((Object)$$7);
            $$4 = $$6 + 1;
            $$5 = $$0.indexOf(36, $$4);
        }
        if ($$4 == 0) {
            throw new IllegalArgumentException("No variables in macro");
        }
        if ($$4 != $$3) {
            $$1.add((Object)$$0.substring($$4));
        }
        return new hy((List<String>)$$1.build(), (List<String>)$$2.build());
    }

    public static boolean b(String $$0) {
        for (int $$1 = 0; $$1 < $$0.length(); ++$$1) {
            char $$2 = $$0.charAt($$1);
            if (Character.isLetterOrDigit($$2) || $$2 == '_') continue;
            return false;
        }
        return true;
    }

    public String a(List<String> $$0) {
        StringBuilder $$1 = new StringBuilder();
        for (int $$2 = 0; $$2 < this.b.size(); ++$$2) {
            $$1.append(this.a.get($$2)).append($$0.get($$2));
            ht.a($$1);
        }
        if (this.a.size() > this.b.size()) {
            $$1.append(this.a.getLast());
        }
        ht.a($$1);
        return $$1.toString();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{hy.class, "segments;variables", "a", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{hy.class, "segments;variables", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{hy.class, "segments;variables", "a", "b"}, this, $$0);
    }
}

