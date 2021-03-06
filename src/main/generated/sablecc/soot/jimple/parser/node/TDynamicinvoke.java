/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import soot.jimple.parser.analysis.*;

@SuppressWarnings("nls")
public final class TDynamicinvoke extends Token
{
    public TDynamicinvoke()
    {
        super.setText("dynamicinvoke");
    }

    public TDynamicinvoke(int line, int pos)
    {
        super.setText("dynamicinvoke");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TDynamicinvoke(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTDynamicinvoke(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TDynamicinvoke text.");
    }
}
