python -m grpc_tools.protoc -I../src/main/proto --python_out=../src/main/python --grpc_python_out=../src/main/python ../src/main/proto/qsn/entity/common/*
python -m grpc_tools.protoc -I../src/main/proto --python_out=../src/main/python --grpc_python_out=../src/main/python ../src/main/proto/qsn/entity/customized/*
python -m grpc_tools.protoc -I../src/main/proto --python_out=../src/main/python --grpc_python_out=../src/main/python ../src/main/proto/qsn/entity/request/*
python -m grpc_tools.protoc -I../src/main/proto --python_out=../src/main/python --grpc_python_out=../src/main/python ../src/main/proto/qsn/entity/response/*
python -m grpc_tools.protoc -I../src/main/proto --python_out=../src/main/python --grpc_python_out=../src/main/python ../src/main/proto/*