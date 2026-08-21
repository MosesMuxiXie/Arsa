/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Stopwatch
 */
import com.google.common.base.Stopwatch;
import java.io.File;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class tm
implements ua {
    private final Document a;
    private final Element b;
    private final Stopwatch c;
    private final File d;

    public tm(File $$0) throws ParserConfigurationException {
        this.d = $$0;
        this.a = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        this.b = this.a.createElement("testsuite");
        Element $$1 = this.a.createElement("testsuite");
        $$1.appendChild(this.b);
        this.a.appendChild($$1);
        this.b.setAttribute("timestamp", DateTimeFormatter.ISO_INSTANT.format(Instant.now()));
        this.c = Stopwatch.createStarted();
    }

    private Element a(ta $$0, String $$1) {
        Element $$2 = this.a.createElement("testcase");
        $$2.setAttribute("name", $$1);
        $$2.setAttribute("classname", $$0.t().toString());
        $$2.setAttribute("time", String.valueOf((double)$$0.l() / 1000.0));
        this.b.appendChild($$2);
        return $$2;
    }

    @Override
    public void a(ta $$0) {
        String $$1 = $$0.b().toString();
        String $$2 = $$0.n().getMessage();
        Element $$3 = this.a.createElement($$0.r() ? "failure" : "skipped");
        $$3.setAttribute("message", "(" + $$0.c().y() + ") " + $$2);
        Element $$4 = this.a($$0, $$1);
        $$4.appendChild($$3);
    }

    @Override
    public void b(ta $$0) {
        String $$1 = $$0.b().toString();
        this.a($$0, $$1);
    }

    @Override
    public void a() {
        this.c.stop();
        this.b.setAttribute("time", String.valueOf((double)this.c.elapsed(TimeUnit.MILLISECONDS) / 1000.0));
        try {
            this.a(this.d);
        }
        catch (TransformerException $$0) {
            throw new Error("Couldn't save test report", $$0);
        }
    }

    public void a(File $$0) throws TransformerException {
        TransformerFactory $$1 = TransformerFactory.newInstance();
        Transformer $$2 = $$1.newTransformer();
        DOMSource $$3 = new DOMSource(this.a);
        StreamResult $$4 = new StreamResult($$0);
        $$2.transform($$3, $$4);
    }
}

