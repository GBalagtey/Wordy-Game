package wordyGame;


/**
* wordyGame/WordSeqHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Wordy.idl
* Sunday, June 18, 2023 11:16:05 PM SGT
*/

abstract public class WordSeqHelper
{
  private static String  _id = "IDL:wordyGame/WordSeq:1.0";

  public static void insert (org.omg.CORBA.Any a, wordyGame.Word[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static wordyGame.Word[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = wordyGame.WordHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (wordyGame.WordSeqHelper.id (), "WordSeq", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static wordyGame.Word[] read (org.omg.CORBA.portable.InputStream istream)
  {
    wordyGame.Word value[] = null;
    int _len0 = istream.read_long ();
    value = new wordyGame.Word[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = wordyGame.WordHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, wordyGame.Word[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      wordyGame.WordHelper.write (ostream, value[_i0]);
  }

}