/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public class bhg {
    private static final char a = '\ufffd';
    private static final Optional<Object> b = Optional.of(bhr.a);

    private static boolean a(zf $$0, bfs $$1, int $$2, char $$3) {
        if (Character.isSurrogate($$3)) {
            return $$1.accept($$2, $$0, 65533);
        }
        return $$1.accept($$2, $$0, $$3);
    }

    public static boolean a(String $$0, zf $$1, bfs $$2) {
        int $$3 = $$0.length();
        for (int $$4 = 0; $$4 < $$3; ++$$4) {
            char $$5 = $$0.charAt($$4);
            if (Character.isHighSurrogate($$5)) {
                if ($$4 + 1 >= $$3) {
                    if ($$2.accept($$4, $$1, 65533)) break;
                    return false;
                }
                char $$6 = $$0.charAt($$4 + 1);
                if (Character.isLowSurrogate($$6)) {
                    if (!$$2.accept($$4, $$1, Character.toCodePoint($$5, $$6))) {
                        return false;
                    }
                    ++$$4;
                    continue;
                }
                if ($$2.accept($$4, $$1, 65533)) continue;
                return false;
            }
            if (bhg.a($$1, $$2, $$4, $$5)) continue;
            return false;
        }
        return true;
    }

    public static boolean b(String $$0, zf $$1, bfs $$2) {
        int $$3 = $$0.length();
        for (int $$4 = $$3 - 1; $$4 >= 0; --$$4) {
            char $$5 = $$0.charAt($$4);
            if (Character.isLowSurrogate($$5)) {
                if ($$4 - 1 < 0) {
                    if ($$2.accept(0, $$1, 65533)) break;
                    return false;
                }
                char $$6 = $$0.charAt($$4 - 1);
                if (!(Character.isHighSurrogate($$6) ? !$$2.accept(--$$4, $$1, Character.toCodePoint($$6, $$5)) : !$$2.accept($$4, $$1, 65533))) continue;
                return false;
            }
            if (bhg.a($$1, $$2, $$4, $$5)) continue;
            return false;
        }
        return true;
    }

    public static boolean c(String $$0, zf $$1, bfs $$2) {
        return bhg.a($$0, 0, $$1, $$2);
    }

    public static boolean a(String $$0, int $$1, zf $$2, bfs $$3) {
        return bhg.a($$0, $$1, $$2, $$2, $$3);
    }

    public static boolean a(String $$0, int $$1, zf $$2, zf $$3, bfs $$4) {
        int $$5 = $$0.length();
        zf $$6 = $$2;
        for (int $$7 = $$1; $$7 < $$5; ++$$7) {
            char $$8 = $$0.charAt($$7);
            if ($$8 == '\u00a7') {
                if ($$7 + 1 >= $$5) break;
                char $$9 = $$0.charAt($$7 + 1);
                l $$10 = l.a($$9);
                if ($$10 != null) {
                    $$6 = $$10 == l.v ? $$3 : $$6.c($$10);
                }
                ++$$7;
                continue;
            }
            if (Character.isHighSurrogate($$8)) {
                if ($$7 + 1 >= $$5) {
                    if ($$4.accept($$7, $$6, 65533)) break;
                    return false;
                }
                char $$11 = $$0.charAt($$7 + 1);
                if (Character.isLowSurrogate($$11)) {
                    if (!$$4.accept($$7, $$6, Character.toCodePoint($$8, $$11))) {
                        return false;
                    }
                    ++$$7;
                    continue;
                }
                if ($$4.accept($$7, $$6, 65533)) continue;
                return false;
            }
            if (bhg.a($$6, $$4, $$7, $$8)) continue;
            return false;
        }
        return true;
    }

    public static boolean a(yn $$0, zf $$12, bfs $$22) {
        return $$0.a(($$1, $$2) -> bhg.a($$2, 0, $$1, $$22) ? Optional.empty() : b, $$12).isEmpty();
    }

    public static String a(String $$0) {
        StringBuilder $$12 = new StringBuilder();
        bhg.a($$0, zf.a, (int $$1, zf $$2, int $$3) -> {
            $$12.appendCodePoint($$3);
            return true;
        });
        return $$12.toString();
    }

    public static String a(yn $$0) {
        StringBuilder $$12 = new StringBuilder();
        bhg.a($$0, zf.a, (int $$1, zf $$2, int $$3) -> {
            $$12.appendCodePoint($$3);
            return true;
        });
        return $$12.toString();
    }
}

