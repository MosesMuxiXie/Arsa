/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Pattern;

public class vy
implements wd {
    private static final Pattern a = Pattern.compile("[A-Za-z._]+[A-Za-z0-9._+-]*");
    private final StringBuilder b = new StringBuilder();

    public String a() {
        return this.b.toString();
    }

    @Override
    public void a(vx $$0) {
        this.b.append(vx.b($$0.k()));
    }

    @Override
    public void a(ux $$0) {
        this.b.append($$0.n()).append('b');
    }

    @Override
    public void a(vs $$0) {
        this.b.append($$0.n()).append('s');
    }

    @Override
    public void a(ve $$0) {
        this.b.append($$0.n());
    }

    @Override
    public void a(vh $$0) {
        this.b.append($$0.n()).append('L');
    }

    @Override
    public void a(vc $$0) {
        this.b.append($$0.n()).append('f');
    }

    @Override
    public void a(va $$0) {
        this.b.append($$0.n()).append('d');
    }

    @Override
    public void a(uw $$0) {
        this.b.append("[B;");
        byte[] $$1 = $$0.e();
        for (int $$2 = 0; $$2 < $$1.length; ++$$2) {
            if ($$2 != 0) {
                this.b.append(',');
            }
            this.b.append($$1[$$2]).append('B');
        }
        this.b.append(']');
    }

    @Override
    public void a(vd $$0) {
        this.b.append("[I;");
        int[] $$1 = $$0.g();
        for (int $$2 = 0; $$2 < $$1.length; ++$$2) {
            if ($$2 != 0) {
                this.b.append(',');
            }
            this.b.append($$1[$$2]);
        }
        this.b.append(']');
    }

    @Override
    public void a(vg $$0) {
        this.b.append("[L;");
        long[] $$1 = $$0.g();
        for (int $$2 = 0; $$2 < $$1.length; ++$$2) {
            if ($$2 != 0) {
                this.b.append(',');
            }
            this.b.append($$1[$$2]).append('L');
        }
        this.b.append(']');
    }

    @Override
    public void a(vf $$0) {
        this.b.append('[');
        for (int $$1 = 0; $$1 < $$0.size(); ++$$1) {
            if ($$1 != 0) {
                this.b.append(',');
            }
            $$0.c($$1).a(this);
        }
        this.b.append(']');
    }

    @Override
    public void a(uz $$0) {
        this.b.append('{');
        ArrayList<Map.Entry<String, vz>> $$1 = new ArrayList<Map.Entry<String, vz>>($$0.g());
        $$1.sort(Map.Entry.comparingByKey());
        for (int $$2 = 0; $$2 < $$1.size(); ++$$2) {
            Map.Entry $$3 = (Map.Entry)$$1.get($$2);
            if ($$2 != 0) {
                this.b.append(',');
            }
            this.a((String)$$3.getKey());
            this.b.append(':');
            ((vz)$$3.getValue()).a(this);
        }
        this.b.append('}');
    }

    private void a(String $$0) {
        if (!$$0.equalsIgnoreCase("true") && !$$0.equalsIgnoreCase("false") && a.matcher($$0).matches()) {
            this.b.append($$0);
        } else {
            vx.a($$0, this.b);
        }
    }

    @Override
    public void a(vb $$0) {
        this.b.append("END");
    }
}

