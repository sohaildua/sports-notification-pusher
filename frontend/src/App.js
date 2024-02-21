import './App.css';
import { Football } from './components/Football'
import BackgroundImage from './components/BackgroundImage'

function App() {

    return (
    <BackgroundImage
        imageUrl="https://images7.alphacoders.com/133/1330226.jpeg">
        <Football/>
    </BackgroundImage>
  );
}

export default App;
