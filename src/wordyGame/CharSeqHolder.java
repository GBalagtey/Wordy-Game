package wordyGame;


/**
* wordyGame/CharSeqHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Wordy.idl
* Sunday, June 18, 2023 11:16:05 PM SGT
*/

public final class CharSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public char value[] = null;

  public CharSeqHolder ()
  {
  }

  public CharSeqHolder (char[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = wordyGame.CharSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    wordyGame.CharSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return wordyGame.CharSeqHelper.type ();
  }

}