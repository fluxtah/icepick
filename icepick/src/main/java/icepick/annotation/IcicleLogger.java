package icepick.annotation;

import javax.annotation.processing.Messager;
import javax.lang.model.element.Element;
import javax.tools.Diagnostic;

class IcicleLogger {

    private final Messager messager;

    public IcicleLogger(Messager messager) {
        this.messager = messager;
    }

    public void logError(String message, Object... args) {
        messager.printMessage(Diagnostic.Kind.ERROR, String.format(message, args));
    }

    public void logError(Element element, String message, Object... args) {
        messager.printMessage(Diagnostic.Kind.ERROR, String.format(message, args), element);
    }
}
