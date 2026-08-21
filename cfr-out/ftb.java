/*
 * Decompiled with CFR 0.152.
 */
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class ftb
extends Exception {
    private final Path a;
    private final List<ftd> b;

    public ftb(Path $$0, List<ftd> $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    @Override
    public String getMessage() {
        return ftb.a(this.a, this.b);
    }

    public static String a(Path $$02, List<ftd> $$1) {
        return "Failed to validate '" + String.valueOf($$02) + "'. Found forbidden symlinks: " + $$1.stream().map($$0 -> String.valueOf($$0.a()) + "->" + String.valueOf($$0.b())).collect(Collectors.joining(", "));
    }
}

