package org.omg.IOP;


/**
* org/omg/IOP/ServiceContextListHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/jenkins/workspace/8-2-build-windows-amd64-cygwin/jdk8u333/2551/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Monday, April 25, 2022 10:50:42 PM PDT
*/


/** An array of service contexts, forming a service context list. */
abstract public class ServiceContextListHelper
{
  private static String  _id = "IDL:omg.org/IOP/ServiceContextList:1.0";

  public static void insert (org.omg.CORBA.Any a, org.omg.IOP.ServiceContext[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static org.omg.IOP.ServiceContext[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.IOP.ServiceContextHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (org.omg.IOP.ServiceContextListHelper.id (), "ServiceContextList", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static org.omg.IOP.ServiceContext[] read (org.omg.CORBA.portable.InputStream istream)
  {
    org.omg.IOP.ServiceContext value[] = null;
    int _len0 = istream.read_long ();
    value = new org.omg.IOP.ServiceContext[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = org.omg.IOP.ServiceContextHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, org.omg.IOP.ServiceContext[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      org.omg.IOP.ServiceContextHelper.write (ostream, value[_i0]);
  }

}
