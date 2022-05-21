.class public Main
.super java/lang/Object
.method public <init>()V
.limit stack 128
.limit locals 128
		aload_0
		invokespecial java/lang/Object/<init>()V
		return
.end method
		
.method public static main([Ljava/lang/String;)V
		.limit stack 128
		.limit locals 128
		new Main
		dup
		invokespecial Main/<init>()V
		pop
		new Fptr
		dup
		new Main
		dup
		invokespecial Main/<init>()V
		ldc "k"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 1
		aload 1
		ldc 155
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 1
		ldc 0
		invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 1
		ldc 1
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 1
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		checkcast java/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		return
		.end method
.method public f(Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/Integer;
		.limit stack 128
		.limit locals 128
		new List
		dup
		new java/util/ArrayList
		dup 
		invokespecial java/util/ArrayList/<init>()V
		invokespecial List/<init>(Ljava/util/ArrayList;)V
		astore 3
		
		
		aload 3
		aload 1
		invokevirtual java/lang/Integer/intValue()I
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual List/addElement(Ljava/lang/Object;)V
		
		aload 3
		aload 2
		invokevirtual java/lang/Integer/intValue()I
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual List/addElement(Ljava/lang/Object;)V
		
		aload 3
		aload 1
		invokevirtual java/lang/Integer/intValue()I
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual List/addElement(Ljava/lang/Object;)V
		
		aload 3
		aload 2
		invokevirtual java/lang/Integer/intValue()I
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual List/addElement(Ljava/lang/Object;)V
		
		aload 3
		aload 2
		invokevirtual java/lang/Integer/intValue()I
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual List/addElement(Ljava/lang/Object;)V
		
		aload 3
		aload 2
		invokevirtual java/lang/Integer/intValue()I
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual List/addElement(Ljava/lang/Object;)V
		
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 3
		aload 2
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual List/getElement(I)Ljava/lang/Object;
		checkcast java/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		ldc 2
		imul
		
		invokevirtual java/io/PrintStream/println(I)V
		
		ldc 13
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		areturn
		
		.end method
.method public g()LFptr;
		.limit stack 128
		.limit locals 128
		new Fptr
		dup
		new Main
		dup
		invokespecial Main/<init>()V
		ldc "f"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		areturn
		.end method
.method public h()V
		.limit stack 128
		.limit locals 128
		return
		.end method
.method public r()LFptr;
		.limit stack 128
		.limit locals 128
		new Fptr
		dup
		new Main
		dup
		invokespecial Main/<init>()V
		ldc "m"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		areturn
		.end method
.method public m()Ljava/lang/Integer;
		.limit stack 128
		.limit locals 128
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc 1400
		
		invokevirtual java/io/PrintStream/println(I)V
		
		ldc 15
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		areturn
		
		.end method
.method public j(Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/Integer;
		.limit stack 128
		.limit locals 128
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 1
		invokevirtual java/lang/Integer/intValue()I
		
		invokevirtual java/io/PrintStream/println(I)V
		
		getstatic java/lang/System/out Ljava/io/PrintStream;
		new Fptr
		dup
		new Main
		dup
		invokespecial Main/<init>()V
		ldc "f"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 3
		aload 3
		ldc 20
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 3
		ldc 1
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 3
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		checkcast java/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		
		invokevirtual java/io/PrintStream/println(I)V
		
		ldc 1
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		areturn
		
		.end method
.method public k(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;)Ljava/lang/Integer;
		.limit stack 128
		.limit locals 128
		new Fptr
		dup
		new Main
		dup
		invokespecial Main/<init>()V
		ldc "h"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 4
		aload 4
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		pop
		
		new Fptr
		dup
		new Main
		dup
		invokespecial Main/<init>()V
		ldc "g"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 4
		aload 4
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		checkcast Fptr
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 4
		aload 4
		aload 1
		invokevirtual java/lang/Integer/intValue()I
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 4
		ldc 2
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 4
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		checkcast java/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		
		aload 2
		invokevirtual java/lang/Boolean/booleanValue()Z
		ifeq Label0
		aload 3
		invokevirtual java/lang/Integer/intValue()I
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		areturn
		goto Label1
		Label0:
		getstatic java/lang/System/out Ljava/io/PrintStream;
		new Fptr
		dup
		new Main
		dup
		invokespecial Main/<init>()V
		ldc "j"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 4
		aload 4
		aload 3
		invokevirtual java/lang/Integer/intValue()I
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 4
		aload 3
		invokevirtual java/lang/Integer/intValue()I
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 4
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		checkcast java/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		
		invokevirtual java/io/PrintStream/println(I)V
		Label1:
		
		new Fptr
		dup
		new Main
		dup
		invokespecial Main/<init>()V
		ldc "r"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 4
		aload 4
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		checkcast Fptr
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 4
		aload 4
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		checkcast java/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		
		ldc 2
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		areturn
		
		.end method
