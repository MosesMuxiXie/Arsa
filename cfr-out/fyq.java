/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  com.google.common.collect.Lists
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jspecify.annotations.Nullable;

public abstract class fyq {
    private static final String a = "/\\*(?:[^*]|\\*+[^*/])*\\*+/";
    private static final String b = "//[^\\v]*";
    private static final Pattern c = Pattern.compile("(#(?:/\\*(?:[^*]|\\*+[^*/])*\\*+/|\\h)*moj_import(?:/\\*(?:[^*]|\\*+[^*/])*\\*+/|\\h)*(?:\"(.*)\"|<(.*)>))");
    private static final Pattern d = Pattern.compile("(#(?:/\\*(?:[^*]|\\*+[^*/])*\\*+/|\\h)*version(?:/\\*(?:[^*]|\\*+[^*/])*\\*+/|\\h)*(\\d+))\\b");
    private static final Pattern e = Pattern.compile("(?:^|\\v)(?:\\s|/\\*(?:[^*]|\\*+[^*/])*\\*+/|(//[^\\v]*))*\\z");

    public List<String> a(String $$0) {
        a $$1 = new a();
        List<String> $$2 = this.a($$0, $$1, "");
        $$2.set(0, this.a($$2.get(0), $$1.a));
        return $$2;
    }

    private List<String> a(String $$0, a $$1, String $$2) {
        int $$3 = $$1.b;
        int $$4 = 0;
        String $$5 = "";
        ArrayList $$6 = Lists.newArrayList();
        Matcher $$7 = c.matcher($$0);
        while ($$7.find()) {
            boolean $$9;
            if (fyq.a($$0, $$7, $$4)) continue;
            String $$8 = $$7.group(2);
            boolean bl2 = $$9 = $$8 != null;
            if (!$$9) {
                $$8 = $$7.group(3);
            }
            if ($$8 == null) continue;
            String $$10 = $$0.substring($$4, $$7.start(1));
            String $$11 = $$2 + $$8;
            Object $$12 = this.a($$9, $$11);
            if (!Strings.isNullOrEmpty((String)$$12)) {
                if (!bhi.d((String)$$12)) {
                    $$12 = (String)$$12 + System.lineSeparator();
                }
                int $$13 = ++$$1.b;
                List<String> $$14 = this.a((String)$$12, $$1, $$9 ? bfp.c($$11) : "");
                $$14.set(0, String.format(Locale.ROOT, "#line %d %d\n%s", 0, $$13, this.a($$14.get(0), $$1)));
                if (!bhi.h($$10)) {
                    $$6.add($$10);
                }
                $$6.addAll($$14);
            } else {
                String $$15 = $$9 ? String.format(Locale.ROOT, "/*#moj_import \"%s\"*/", $$8) : String.format(Locale.ROOT, "/*#moj_import <%s>*/", $$8);
                $$6.add($$5 + $$10 + $$15);
            }
            int $$16 = bhi.c($$0.substring(0, $$7.end(1)));
            $$5 = String.format(Locale.ROOT, "#line %d %d", $$16, $$3);
            $$4 = $$7.end(1);
        }
        String $$17 = $$0.substring($$4);
        if (!bhi.h($$17)) {
            $$6.add($$5 + $$17);
        }
        return $$6;
    }

    private String a(String $$0, a $$1) {
        Matcher $$2 = d.matcher($$0);
        if ($$2.find() && fyq.a($$0, $$2)) {
            $$1.a = Math.max($$1.a, Integer.parseInt($$2.group(2)));
            return $$0.substring(0, $$2.start(1)) + "/*" + $$0.substring($$2.start(1), $$2.end(1)) + "*/" + $$0.substring($$2.end(1));
        }
        return $$0;
    }

    private String a(String $$0, int $$1) {
        Matcher $$2 = d.matcher($$0);
        if ($$2.find() && fyq.a($$0, $$2)) {
            return $$0.substring(0, $$2.start(2)) + Math.max($$1, Integer.parseInt($$2.group(2))) + $$0.substring($$2.end(2));
        }
        return $$0;
    }

    private static boolean a(String $$0, Matcher $$1) {
        return !fyq.a($$0, $$1, 0);
    }

    private static boolean a(String $$0, Matcher $$1, int $$2) {
        int $$3 = $$1.start() - $$2;
        if ($$3 == 0) {
            return false;
        }
        Matcher $$4 = e.matcher($$0.substring($$2, $$1.start()));
        if (!$$4.find()) {
            return true;
        }
        int $$5 = $$4.end(1);
        return $$5 == $$1.start();
    }

    public abstract @Nullable String a(boolean var1, String var2);

    public static String a(String $$0, hpg $$1) {
        if ($$1.c()) {
            return $$0;
        }
        int $$2 = $$0.indexOf(10);
        int $$3 = $$2 + 1;
        return $$0.substring(0, $$3) + $$1.b() + "#line 1 0\n" + $$0.substring($$3);
    }

    static final class a {
        int a;
        int b;

        a() {
        }
    }
}

