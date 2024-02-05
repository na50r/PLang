import ListGroup from "./components/ListGroup";
import Message from "./Message";
import Alert from "./components/Alert";

// function App(){
//   const handleSelectItem = (item:string)=>{
//     console.log(item);
//   }
//   let items = ["New York", "San Francisco", "Los Angeles", "Las Vegas", "London", "Manchester"];

//   return <div><ListGroup items={items} heading='Cities' onSelectItem={handleSelectItem}/></div>;
// }

// export default App;

function App() {
  return (
    <div>
      <Alert text="Hello World"/>
    </div>
  );
}

export default App;
