package wordyGame;

/**
* wordyGame/noWinnerHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Wordy.idl
* Sunday, June 18, 2023 11:16:05 PM SGT
*/

public final class noWinnerHolder implements org.omg.CORBA.portable.Streamable
{
  public wordyGame.noWinner value = null;

  public noWinnerHolder ()
  {
  }

  public noWinnerHolder (wordyGame.noWinner initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = wordyGame.noWinnerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    wordyGame.noWinnerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return wordyGame.noWinnerHelper.type ();
  }

}